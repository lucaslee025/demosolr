import bean.Item;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleFacetQuery;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author LucasLee
 * @Created 2018/9/1
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationSolr.xml")
public class SolrTest {
    @Autowired
    private SolrTemplate solrTemplate;

    @Test
    public void test() {

        Item item = new Item();
        item.setId(8883L);
        item.setName("我们一起学猫叫");
        item.setPrice(33.03);
        solrTemplate.saveBean(item);
        solrTemplate.commit();
    }

    @Test
    public void findById() {
        Item byId = solrTemplate.getById(8888L, Item.class);
        System.out.println(byId);
    }

    @Test
    public void queryByPage() {
        Query query = new SimpleQuery("*:*");
        query.setOffset(3800);
        query.setRows(20);
        ScoredPage<Item> items = solrTemplate.queryForPage(query, Item.class);
        for (Item item : items.getContent()
        ) {
            System.out.println(item);
        }

    }
}

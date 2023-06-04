import com.deluce.entity.SelectEM;
import com.deluce.mapper.SendEMRequestMapper;
import com.deluce.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SendEMRequestMapper mapper = sqlSession.getMapper(SendEMRequestMapper.class);
        SelectEM selectByUsername = mapper.selectByUsername("05/04/0002");
        System.out.println(selectByUsername.getAssetSN()+"      "+selectByUsername.getAssetName()+"         "+selectByUsername.getDepartment());

    }

}

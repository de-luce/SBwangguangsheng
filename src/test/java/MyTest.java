import com.deluce.mapper.NewRequestReportMapper;
import com.deluce.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        NewRequestReportMapper mapper = sqlSession.getMapper(NewRequestReportMapper.class);
        int i = mapper.insertEM();
        System.out.println(i);
    }

}

import com.deluce.entity.SelectEM;
import com.deluce.mapper.SelectMapper;
import com.deluce.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<SelectEM> selectEMList = mapper.selectEM("josefa");
        for (SelectEM selectEM : selectEMList) {
            System.out.println(selectEM.getAssetSN() + ", " + selectEM.getAssetName() + ", " + selectEM.getLastClosedEM() + ", " + selectEM.getNumberOfEMs());
        }

    }

}

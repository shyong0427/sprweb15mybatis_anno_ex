package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class ListImpl implements ListInter{
	@Autowired
	private ListAnnoInter listAnnoInter;
	
	@Override
	public List<JikwonDto> selectDataAll() {
		return listAnnoInter.selectAllData();
	}
	
	@Override
	public List<JikwonDto> selectDataBuser(String buser_num){
		return listAnnoInter.selectBuserData(buser_num);
	}
	
	@Override
	public BuserDto selectBuser(String buser_num){
		return listAnnoInter.selectOne(buser_num);
	}
}


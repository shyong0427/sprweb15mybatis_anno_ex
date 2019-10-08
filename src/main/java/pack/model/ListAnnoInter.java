package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface ListAnnoInter {
	@Select("select jikwon_no,jikwon_name,buser_name,jikwon_jik,jikwon_ibsail,buser_num from jikwon,buser where jikwon.buser_num = buser.buser_no order by buser_name,jikwon_name")
	public List<JikwonDto> selectAllData();
	
	@Select("select jikwon_no,jikwon_name,buser_name,jikwon_jik,jikwon_ibsail,buser_num from jikwon,buser  where jikwon.buser_num = buser.buser_no and buser_num='${value}' order by buser_name,jikwon_name")
	public List<JikwonDto> selectBuserData(String buser_num);
	
	@Select("select * from buser where buser_no='${value}'")
	BuserDto selectOne(String buser_num);
}
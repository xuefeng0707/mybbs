package mybbs.dao;

import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;

public abstract class AbstractDAO {
	
	@Resource
	protected SqlSessionTemplate sqlSession;
}

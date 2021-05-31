package gahee.spring.annotation;

import org.springframework.stereotype.Repository;

import gahee.spring.sungjuk.SungJuk;
import gahee.spring.sungjuk.SungJukDAO;

@Repository("sdao")
public class SungJukDAOImpl implements SungJukDAO {

	@Override
	public void insertSungJuk(SungJuk sj) {
		System.out.println("성적 추가됨!");
	}

}
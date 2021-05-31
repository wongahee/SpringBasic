package gahee.spring.sungjuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSungJukApp02 {

	public static void main(String[] args) {
		// 스프링으로 구현하는 성적처리프로그램
		// 각 모듈간의 의존성을 낮추기 위해
		// Service, DAO 클래스는 인터페이스를 기반으로 작성함
		// Main 클래스 : SpringSungJukApp01
		// Service 클래스 : SungJukService -> SungJukServiceImpl
		// DAO 클래스 : SungJukDAO -> SungJukDAOImpl
		// 입력받아(main), 계산(service)후 db에 전달(dao)
		
		// 전체적인 흐름
		// SpringSungJukApp01 -> SungJukServiceImpl -> SungJukDAOImpl
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/sungjuk02.xml");
		
		// sungjuk.xml에 의해 스프링컨테이너가 
		// 미리 생성해둔 sjsrv객체를 가져다씀. 
		// sjsrv변수에 초기화함
		SungJukService sjsrv = (SungJukService)ctx.getBean("sjsrv");
		
		// sjsrv변수의 newSungJuk 메서드 호출
		sjsrv.newSungJuk();
	}

}

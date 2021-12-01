package com.toyshop.demo;

import com.toyshop.demo.repository.JdbcMemberRepository;
import com.toyshop.demo.repository.JdbcTemplateMemberRepository;
import com.toyshop.demo.repository.MemberRepository;
import com.toyshop.demo.repository.MemoryMemberRepository;
import com.toyshop.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * description : 명시적으로 @Service || @Repository 로 등록하지 않고, 직접 등록해줄 수 있음
 */
@Configuration
public class SpringConfig {
    /**
     * JDBC를 이용해 데이터 베이스 연동을 위한 객체
     */
    private final DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}

package com.toyshop.demo;

import com.toyshop.demo.repository.MemberRepository;
import com.toyshop.demo.repository.MemoryMemberRepository;
import com.toyshop.demo.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description : 명시적으로 @Service || @Repository 로 등록하지 않고, 직접 등록해줄 수 있음
 */
@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}

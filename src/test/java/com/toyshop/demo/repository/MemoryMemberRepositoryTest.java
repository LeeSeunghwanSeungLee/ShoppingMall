package com.toyshop.demo.repository;

import com.toyshop.demo.domain.Member;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemoryMemberRepositoryTest {
    MemberRepository repository = new MemoryMemberRepository();


    @AfterEach
    public void afterEach() {
        this.repository.clearAll();
    }
    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");
        member.setId(1L);

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
//        Assertions.assertEquals(member, null);
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        // givne

        // when

        // then
    }

    @Test
    public void findAll() {
        // given

        // when

        // then
    }


}

package com.example.mytrip.beans.dao;

import com.example.mytrip.beans.vo.MemberVO;
import com.example.mytrip.mappers.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberDAO {
    private final MemberMapper mapper;

    public List<MemberVO> getList(){
        return mapper.getList();
    }
}

package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Member;
import com.thoughtworks.capability.gtb.entrancequiz.service.MemberService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
//TODO GTB-综合: - MemberController.java:14 代码实现太少，无法给出更多的feedback
//TODO GTB-完成度: - MemberController.java:14 缺少添加学员、分组、查看分组等接口
public class MemberController {
    MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @CrossOrigin("http://localhost:1234")
    //TODO GTB-知识点: * 了解下restful规范
    //TODO GTB-完成度: - MemberController.java:25 获取所有学员的需求，没有要求打乱顺序
    @GetMapping("/allMembers")
    @ResponseBody
    public List<Member> getAllMembers(){
        List<Member> memberList = memberService.getAllMembers();
        Collections.shuffle(memberList);
        return memberList;
    }

}

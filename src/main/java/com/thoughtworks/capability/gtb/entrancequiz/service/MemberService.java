package com.thoughtworks.capability.gtb.entrancequiz.service;


import com.thoughtworks.capability.gtb.entrancequiz.model.Member;
import com.thoughtworks.capability.gtb.entrancequiz.repository.MemberProvider;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberService {

    public List<Member> getAllMembers(){
        return MemberProvider.MemberList();
    }

}

package com.kch.exam.member;

import com.kch.exam.Rq;

public class MemberController {
    public void showLogin(Rq rq) {
        rq.appendBody("로그인");
    }
}
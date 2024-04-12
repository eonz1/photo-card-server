package com.realworld.feature.profile.service;

<<<<<<< HEAD
import com.realworld.feature.member.domain.Member;
import com.realworld.feature.member.repository.CommandMemberPort;
=======
>>>>>>> product
import com.realworld.feature.member.repository.MemberRepository;
import com.realworld.feature.profile.controller.request.UpdateNickNameRequest;
import com.realworld.global.code.ErrorCode;
import com.realworld.global.config.exception.CustomMemberExceptionHandler;
<<<<<<< HEAD
=======
import com.realworld.feature.member.domain.Member;

>>>>>>> product
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProfileCommandServiceImpl implements ProfileCommandService {
<<<<<<< HEAD
    private final CommandMemberPort commandMemberPort;
    private final MemberRepository repository;

=======
    private final MemberRepository repository;
>>>>>>> product
    @Transactional
    @Override
    public Member updateNickname(UpdateNickNameRequest request, String userId) {
        Member member = Member.builder()
                .nickname(request.getNickname())
                .userId(userId)
                .build();

        long update = -1;
<<<<<<< HEAD
=======
        if(!StringUtils.isEmpty(request.getNickname())) update = repository.updateNickname(member.toEntity());;
>>>>>>> product

        if (!StringUtils.isEmpty(request.getNickname())) update = repository.updateNickname(member.toEntity());

        if (update < 0) throw new CustomMemberExceptionHandler(ErrorCode.BAD_REQUEST_ERROR);

        return member;
    }
}

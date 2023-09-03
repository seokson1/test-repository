package com.zerobase.cms.user.domain.model;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
@Getter
@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
public abstract class BaseEntity { // 역할 필요한 속성들이 있음

    @CreatedDate
    private LocalDateTime  createAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;
}

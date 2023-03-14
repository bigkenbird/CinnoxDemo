package com.cinnox.demo.response;

import java.util.List;

import com.cinnox.demo.dto.UserMessageDto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper=true)
public class LineMessageQueryUserMsgRsp extends BaseRsp{
	
	private List<UserMessageDto> userMessageDtos;

}

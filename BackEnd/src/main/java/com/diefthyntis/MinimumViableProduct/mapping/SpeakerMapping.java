package com.diefthyntis.MinimumViableProduct.mapping;

import org.springframework.stereotype.Component;

import com.diefthyntis.MinimumViableProduct.dto.response.SpeakerResponse;
import com.diefthyntis.MinimumViableProduct.model.Speaker;
import com.diefthyntis.MinimumViableProduct.util.DateUtils;




@Component
public class SpeakerMapping {
	public SpeakerResponse mapSpeakerToSpeakerResponse(Speaker speaker) {
		final SpeakerResponse speakerResponse = new SpeakerResponse();
		speakerResponse.setId(speaker.getId());
		speakerResponse.setLogin(speaker.getLogin());
		speakerResponse.setCreatedAt(DateUtils.convertLocalDateToString(speaker.getCreatedAt()));
		speakerResponse.setUpdatedAt(DateUtils.convertLocalDateToString(speaker.getUpdatedAt()));
		return speakerResponse;
	}
}

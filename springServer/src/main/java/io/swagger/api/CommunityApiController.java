package io.swagger.api;

import io.swagger.model.Community;
import io.swagger.persistence.service.IAgentService;
import io.swagger.persistence.service.ICommunityService;
import site.verity.web.exception.UnprocessableEntityException;
import site.verity.web.util.RestPreconditions;
import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-28T16:27:10.767-08:00")

@Controller
public class CommunityApiController implements CommunityApi {

	@Autowired
	private ICommunityService communityService;
	
	@Autowired
	private IAgentService agentService;

	public ResponseEntity<Community> createCommunity(@ApiParam(value = "") @RequestBody Community body) {
		if (body.getUuid() == null || body.getUuid().isEmpty()) {
			// create the UUID if it has not been provided (simulate blockchain contract)
			body.setUuid(java.util.UUID.randomUUID().toString());
		}else{ 
			//allow caller to generate UUIDs and use UUID provided
			if (communityService.findByUuid(body.getUuid()) != null) {
				throw new UnprocessableEntityException("Cannot create - uuid is not unique, this community allready exists.");
			}
		}
		
		if (body.getAgent().getUuid().isEmpty()) {
			body.getAgent().setUuid(java.util.UUID.randomUUID().toString());
		}else{ 
			//use UUID provided
			if (agentService.findByUuid(body.getAgent().getUuid()) != null) {
				//return new ResponseEntity<Community>(HttpStatus.UNPROCESSABLE_ENTITY);
				throw new UnprocessableEntityException("Cannot find agent by uuid provided");
			}
		}
		
		communityService.create(body);
		return new ResponseEntity<Community>(body, HttpStatus.CREATED);
	}

	public ResponseEntity<Community> getCommunity(@ApiParam(value = "", required = true) @PathVariable("uuid") String uuid) {
		Community community = communityService.findByUuid(uuid);
		RestPreconditions.assertResourceFound(community != null);
		return new ResponseEntity<Community>(community, HttpStatus.OK);

	}

	public ResponseEntity<Void> updateCommunity(@ApiParam(value = "") @RequestBody Community body) {
		if (communityService.findByUuid(body.getUuid()) != null) {
			return new ResponseEntity<Void>(HttpStatus.UNPROCESSABLE_ENTITY);
		}
		communityService.update(body);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
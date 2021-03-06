package io.swagger.api;

import io.swagger.model.InlineResponse403;
import io.swagger.model.Transaction;
import io.swagger.model.InlineResponse404;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-01T16:45:12.037-08:00")

@Api(value = "transaction", description = "the transaction API")
public interface TransactionApi {

    @ApiOperation(value = "create transaction", notes = "", response = Transaction.class, tags={ "Transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "hash - Ethereum address of the transaction. For demo / proof of concept this will be a db id or offchain hash.", response = Transaction.class),
        @ApiResponse(code = 401, message = "", response = Transaction.class),
        @ApiResponse(code = 403, message = "", response = Transaction.class),
        @ApiResponse(code = 404, message = "", response = Transaction.class),
        @ApiResponse(code = 409, message = "", response = Transaction.class),
        @ApiResponse(code = 422, message = "", response = Transaction.class),
        @ApiResponse(code = 500, message = "", response = Transaction.class) })
    @RequestMapping(value = "/transaction",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Transaction> createTransaction(

@ApiParam(value = ""  ) @RequestBody Transaction body

);


    @ApiOperation(value = "get Transactions by targetAgentId", notes = "TODO:consider paginating results in similar way to reddit API https://www.reddit.com/dev/api/", response = Transaction.class, responseContainer = "List", tags={ "Transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Transaction.class),
        @ApiResponse(code = 401, message = "", response = Transaction.class),
        @ApiResponse(code = 403, message = "", response = Transaction.class),
        @ApiResponse(code = 404, message = "", response = Transaction.class),
        @ApiResponse(code = 409, message = "", response = Transaction.class),
        @ApiResponse(code = 422, message = "", response = Transaction.class),
        @ApiResponse(code = 500, message = "", response = Transaction.class) })
    @RequestMapping(value = "/transaction/{targetAgentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Transaction>> getTransactionByTargetAgentId(
@ApiParam(value = "",required=true ) @PathVariable("targetAgentId") String targetAgentId


);


    @ApiOperation(value = "get transactions by targetAgent and valueAction", notes = "", response = Void.class, tags={ "Transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 401, message = "", response = Void.class),
        @ApiResponse(code = 403, message = "", response = Void.class),
        @ApiResponse(code = 404, message = "", response = Void.class),
        @ApiResponse(code = 409, message = "", response = Void.class),
        @ApiResponse(code = 422, message = "", response = Void.class),
        @ApiResponse(code = 500, message = "", response = Void.class) })
    @RequestMapping(value = "/transaction/{targetAgentId}/{valueActionId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getTransactionByTargetAgentIdByValueActionId(
@ApiParam(value = "",required=true ) @PathVariable("targetAgentId") String targetAgentId


,
@ApiParam(value = "",required=true ) @PathVariable("valueActionId") String valueActionId


);


    @ApiOperation(value = "get Transactions by Dates", notes = "", response = Transaction.class, responseContainer = "List", tags={ "Transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Transaction.class),
        @ApiResponse(code = 401, message = "", response = Transaction.class),
        @ApiResponse(code = 403, message = "", response = Transaction.class),
        @ApiResponse(code = 404, message = "", response = Transaction.class),
        @ApiResponse(code = 409, message = "", response = Transaction.class),
        @ApiResponse(code = 422, message = "", response = Transaction.class),
        @ApiResponse(code = 500, message = "", response = Transaction.class) })
    @RequestMapping(value = "/transaction/{targetAgentId}/{fromdate}/{todate}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Transaction>> getTransactionsByDates(
@ApiParam(value = "",required=true ) @PathVariable("targetAgentId") String targetAgentId


,
@ApiParam(value = "",required=true ) @PathVariable("fromdate") String fromdate


,
@ApiParam(value = "",required=true ) @PathVariable("todate") String todate


);

}

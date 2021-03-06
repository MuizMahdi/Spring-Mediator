package com.muizz.spring.mediator.core;

import com.muizz.spring.mediator.payload.ApiRequest;

/**
 * @param <RequestT>  Type of the request that will be handled
 * @param <ResponseT> Type of the response that will be return after handling the request
 */
public interface Handler<RequestT extends ApiRequest<ResponseT>, ResponseT> {
   /**
    * 
    * @param request Request instance that was passed through mediator
    * @return        Result of handling the given request
    */
   ResponseT handle(final RequestT request);
}

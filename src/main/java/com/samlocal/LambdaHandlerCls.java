package com.samlocal;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class LambdaHandlerCls implements RequestHandler<Request, Response>
{

    @Override
    public Response handleRequest(final Request input, final Context context) {
        return Service.getResponse(input);
    }
}

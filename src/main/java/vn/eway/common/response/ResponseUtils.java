package vn.eway.common.response;

import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;

public class ResponseUtils {
	public static void ok(RoutingContext routingContext, Object response) {
		json(routingContext, 200, response);
	}

	public static void ok(RoutingContext routingContext) {
		json(routingContext).end();
	}

	public static void redirect(RoutingContext routingContext, String locationUrl) {
		routingContext.response().putHeader("Location", locationUrl).setStatusCode(307).end();
	}

	public static void badRequest(RoutingContext routingContext) {
		routingContext.response().setStatusCode(400).end();
	}

	public static void badRequest(RoutingContext routingContext, Throwable throwable) {
		json(routingContext, 400, throwable.getMessage());
	}

	public static void badRequest(RoutingContext routingContext, Object response) {
		json(routingContext, 400, response);
	}

	public static void forbidden(RoutingContext routingContext, Object response) {
		json(routingContext, 403, response);
	}

	public static void notFound(RoutingContext routingContext, Object response) {
		json(routingContext, 404, response);
	}

	public static void internalServerError(RoutingContext routingContext, Object response) {
		json(routingContext, 500, response);
	}

	public static void internalServerError(RoutingContext routingContext, Throwable throwable) {
		json(routingContext, 500, throwable.getMessage());
	}

	public static void json(RoutingContext routingContext, int httpStatus, Object response) {
		json(routingContext).setStatusCode(httpStatus).end(Json.encodeToBuffer(response));
	}

	public static HttpServerResponse json(RoutingContext routingContext) {
		return routingContext.response().putHeader("Content-type", "application/json");
	}

	private JsonObject errorMessageToErrorBody(String message) {
		return new JsonObject().put("message", message);
	}
}
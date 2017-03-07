package com.gwtmaterial.test.client.application.sw;


import gwt.material.design.jscore.client.api.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true, name="serviceWorker")
public class ServiceWorkerContainer {
	
	@JsMethod
	public native String toString();
	
	@JsMethod
	public native Promise register(String scriptName);

}
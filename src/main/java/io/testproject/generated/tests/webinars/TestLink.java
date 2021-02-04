package io.testproject.generated.tests.webinars;

import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;
public class TestLink{
	
	
	public static String DEVKEY="58a7453f86c7e93d6cbfbc2916ff85dc";
	public static String URL="http://hello-pomelo-testlink.westeurope.cloudapp.azure.com/lib/api/xmlrpc/v1/xmlrpc.php";
	static String testProject				= "Webinars";
	static String testPlan					= "WebinarsPlan";
	static String build					= "Version 1";
	public static void updateTestLinkResult(String testCase, String exception, String result) throws TestLinkAPIException{
		TestLinkAPIClient testlinkAPIClient = new TestLinkAPIClient(DEVKEY,URL);
		testlinkAPIClient.reportTestCaseResult(testProject, testPlan, testCase, build, exception, result);
		 }
}


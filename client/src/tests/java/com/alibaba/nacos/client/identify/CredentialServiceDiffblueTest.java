package com.alibaba.nacos.client.identify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.identify.CredentialService
 *
 * @author Diffblue JCover
 */

public class CredentialServiceDiffblueTest {

    @Test(timeout=10000)
    public void freeInstance1() {
        CredentialService credentialService = CredentialService.freeInstance();
        assertThat(credentialService.getAccessKey(), is(nullValue()));
        assertThat(credentialService.getCredential().getAccessKey(), is(nullValue()));
        assertThat(credentialService.getCredential().getSecretKey(), is(nullValue()));
        assertThat(credentialService.getCredential().getTenantId(), is(nullValue()));
        assertThat(credentialService.getCredential().getAccessKey(), is(nullValue()));
        assertThat(credentialService.getCredential().getSecretKey(), is(nullValue()));
        assertThat(credentialService.getSecretKey(), is(nullValue()));
    }

//    @Test(timeout=10000)
//    public void freeInstance2() {
//        CredentialService credentialService = CredentialService.freeInstance("bar");
//        assertThat(credentialService.getAccessKey(), is(nullValue()));
//        assertThat(credentialService.getCredential().getAccessKey(), is(nullValue()));
//        assertThat(credentialService.getCredential().getSecretKey(), is(nullValue()));
//        assertThat(credentialService.getCredential().getTenantId(), is(nullValue()));
//        assertThat(credentialService.getCredential().getAccessKey(), is(nullValue()));
//        assertThat(credentialService.getCredential().getSecretKey(), is(nullValue()));
//        assertThat(credentialService.getSecretKey(), is(nullValue()));
//    }

    @Test(timeout=10000)
    public void freeInstanceReturnsNull() {
        assertThat(CredentialService.freeInstance(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getInstance1() {
        CredentialService result = CredentialService.getInstance();
        assertThat(result.getAccessKey(), is(nullValue()));
        assertThat(result.getCredential().getAccessKey(), is(nullValue()));
        assertThat(result.getCredential().getSecretKey(), is(nullValue()));
        assertThat(result.getCredential().getTenantId(), is(nullValue()));
        assertThat(result.getCredential().getAccessKey(), is(nullValue()));
        assertThat(result.getCredential().getSecretKey(), is(nullValue()));
        assertThat(result.getSecretKey(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getInstance2() {
        CredentialService credentialService = CredentialService.getInstance();
        assertThat(credentialService.getAccessKey(), is(nullValue()));
        assertThat(credentialService.getCredential().getAccessKey(), is(nullValue()));
        assertThat(credentialService.getCredential().getSecretKey(), is(nullValue()));
        assertThat(credentialService.getCredential().getTenantId(), is(nullValue()));
        assertThat(credentialService.getCredential().getAccessKey(), is(nullValue()));
        assertThat(credentialService.getCredential().getSecretKey(), is(nullValue()));
        assertThat(credentialService.getSecretKey(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getInstanceAppNameIsBar() {
        CredentialService result = CredentialService.getInstance("bar");
        assertThat(result.getAccessKey(), is(nullValue()));
        assertThat(result.getCredential().getAccessKey(), is(nullValue()));
        assertThat(result.getCredential().getSecretKey(), is(nullValue()));
        assertThat(result.getCredential().getTenantId(), is(nullValue()));
        assertThat(result.getCredential().getAccessKey(), is(nullValue()));
        assertThat(result.getCredential().getSecretKey(), is(nullValue()));
        assertThat(result.getSecretKey(), is(nullValue()));
    }
}

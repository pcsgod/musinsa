package com.musinsa.searchdemo.service;

import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

public class ElasticSearchService extends RestHighLevelClient {

    RestHighLevelClient client=  null;

    public ElasticSearchService(RestClientBuilder restClientBuilder) {
        super(restClientBuilder);
        client = this;
    }


}
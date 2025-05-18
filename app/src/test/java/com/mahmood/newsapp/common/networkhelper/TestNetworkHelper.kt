package com.mahmood.newsapp.common.networkhelper

class TestNetworkHelper : NetworkHelper {
    override fun isNetworkConnected(): Boolean {
        return true
    }
}
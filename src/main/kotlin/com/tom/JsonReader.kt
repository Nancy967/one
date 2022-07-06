package com.tom

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    /*val url = URL("http://opendataap2.penghu.gov.tw/./resource/files/2022-06-23/ab8b9f31f05e6e1a7ecd1c624b089b36.json")
    val connection = url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(connection.inputStream))
    var line = br.readLine()
    val json = StringBuffer()
    while (line != null){
        json.append(line)
        line = br.readLine()
    }
    println(json.toString())*/

    val url = URL("http://opendataap2.penghu.gov.tw/./resource/files/2022-06-23/ab8b9f31f05e6e1a7ecd1c624b089b36.json")
//    println(url.readText())
    with(url.openConnection() as HttpURLConnection){
        val br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }
    }
}
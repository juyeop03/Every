package com.example.every.network.retrofit.interfaces.student

import com.example.every.network.Data
import com.example.every.network.Response
import com.example.every.network.request.model.student.BambooPostData
import com.example.every.network.request.model.student.BambooReplyData
import com.example.every.network.request.model.student.BambooReplyEditData
import retrofit2.Call
import retrofit2.http.*

interface Bamboo {

    @GET("bamboo/post")
    fun getBambooPost(@Header("token") token : String) : Call<Response<Data>>

    @GET("bamboo/reply")
    fun getBambooComment(@Header("token") token : String, @Query("post") post : Int) : Call<Response<Data>>

    @POST("bamboo/post")
    fun postBamboo(@Header("token") token : String, @Body bambooPostData: BambooPostData) : Call<Response<Data>>

    @GET("member/student/{studentIdx}")
    fun getStudentInfo(@Header("token") token : String, @Path("studentIdx") studentIdx : Int) : Call<Response<Data>>

    @POST("bamboo/reply")
    fun postBambooReply(@Header("token") token : String, @Body bambooReplyData : BambooReplyData) : Call<Response<Data>>

    @DELETE("bamboo/reply/{replyIdx}")
    fun deleteBambooReply(@Header("token") token : String, @Path("replyIdx") replyIdx : Int) : Call<Response<Data>>

    @PUT("bamboo/reply/{replyIdx}")
    fun editBambooReply(@Header("token") token : String, @Body bambooReplyEditData : BambooReplyEditData, @Path("replyIdx") replyIdx : Int) : Call<Response<Data>>

    @GET("bamboo/post")
    fun getBambooPostOrder(@Header("token") token : String, @Query("order") order : String) : Call<Response<Data>>
}
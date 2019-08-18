package com.picodiploma.mhabib.pendaftaranpraktikum;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterAPI {

    @FormUrlEncoded
    @POST("http://192.168.1.80/belajarapi/crudmysqlretrofit/insert.php")
    Call <Value> daftar(@Field("npm") String npm,
                        @Field("nama") String nama,
                        @Field("kelas") String kelas,
                        @Field("sesi") String sesi);
}
package com.neppplus.kotlingrammar_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        코틀린 문법 연습용 프로젝트 (UI 작업 X)

//        본인의 이름을 저장할 String 변수 myName으로 만들자.

        val myName : String

//        myName에 실제 이름 대입.
        myName = "조경진"

//        myName = "코딩티처 지니"  // val는 저장된 값 변경 불가

//        로그로 저장된 내 이름 출력.
        Log.d("변수확인", myName)


//        본인의 출생 년도를 변수로 저장. (myBirthYear)
        var myBirthYear : Int
        myBirthYear = 1988
        Log.d("출생년도", myBirthYear.toString())




//      조건문 체험 부분

        val userAge = 13

        if ( userAge >= 20 ) {
            Log.d("나이확인",  "성인입니다.")
        }
        else if ( userAge >= 17 ) {
            Log.d("나이확인", "고등학생입니다.")
        }
        else if ( userAge >= 14 ) {
            Log.d("나이확인", "중학생입니다.")
        }
        else if ( userAge >= 8 ) {
            Log.d("나이확인", "초등학생입니다.")
        }
        else {
            Log.d("나이확인", "미취학아동입니다.")
        }



//        장기근속의 3대 요건?
//        1. 높은 급여
//        2. 가까운 거리
//        3. 워라밸


        val companyASalary = 5800
        val companyADistance = 12.5
        val companyABalance = true

//        질문 1. 연봉이 4천이상이면 취업.

        if ( companyASalary >= 4000 ) {
//            연봉 높아서 취업.
        }

//        사람2. 거리가 10km 미만 AND 연봉 3000 이상.

        if ( companyADistance < 10 && companyASalary >= 3000 ) {
//            사람2는 A회사에 취업? 거리가 멀어서 취업 안함.
        }


//        사람3. 워라밸이 OK거나, 연봉이 5천이상.
        if ( companyABalance || companyASalary >= 5000 ) {
//            사람3은 취업? 두가지 조건 전부 만족 True (하나만 해도 됨)
        }

    }

}












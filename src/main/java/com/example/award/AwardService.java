package com.example.award;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AwardService {

   /* @Autowired //setter injection
    public void setAward(Award award) {
        this.award = award;
    }
*/
    @Autowired
    //@Qualifier("oscarAward")
    Award award; //field level injection

  /*  @Autowired //optional
    public AwardService(Award award){ //constructor injection
        this.award=award;
    }*/

    public void printAward(){
        award.displayAward();
    }





}

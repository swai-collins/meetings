package com.swai

import java.net.Inet4Address


open class Meeting(val meetingName: String, open val location: Location){

    private val logger = Logger()


    fun addParticipants(participant: Participant){
        if (verifyParticpant(participant))
        println("Added participants: ${participant.participantName}")
    }

    private fun verifyParticpant(participant: Participant) : Boolean{
        println("Try to verify")
        return true
    }

    protected open fun verifyMeeting(){
        println("VerifyMeeting: verified meeting")
    }
}


class PersonlaReview(meetingName: String, val employee: Participant, reviewers: List<Participant>, override val location: Room) : Meeting(meetingName, location){

    fun closeReview(){
        println("Review ended")
        verifyMeeting()
    }

    override fun verifyMeeting(){
        println("PersonalReview: verify meeting")
        super.verifyMeeting()
    }
}
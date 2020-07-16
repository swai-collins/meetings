package com.swai

fun main(){
    val meeting = Meeting("Review")
    val review = PersonlaReview("Review Meeting", Participant(Name("Alice"), ""), listOf(), Location("Room 1"))

    println("Created: $review with name ${meeting.meetingName} at ${meeting.location}")

    review.closeReview()

    val name = Name("Kevin Gates")

    val participant = Participant(name, "swailerc23@gmail.com" )


    //println("Created: $meeting")
    //meeting.meetingName = "Review"

    meeting.addParticipants(participant)


    //meeting.logger


}
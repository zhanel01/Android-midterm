package com.example.aviatickets.model.entity

data class Airline(
    val name: String,
    val code: String,
) {
    val imgUrl: String
        get() = determineImgUrl(name)

    private fun determineImgUrl(name: String): String {
        return when (name) {
            "Air Astana" -> "https://logonoid.com/images/air-astana-logo.png"
            "QazaqAir" -> "https://airport-uk.kz/images/log_bek%20_air.png"
            "FlyArystan" -> "https://pro-agent.kz/userfiles/upload/touroperators/FlyArystan-logo-1920x600.jpg"
            "SCAT Airlines" -> "https://logos-world.net/wp-content/uploads/2023/06/SCAT-Airlines-Logo.png"

            else -> ""
        }
    }

}
package ecowind.ru.responses.detail

data class ClientDetailRs(
    val login: String,
    val socialMedia: SocialMediaDetailRs? = null,
    val personalData: PersonalDataDetailRs? = null
)
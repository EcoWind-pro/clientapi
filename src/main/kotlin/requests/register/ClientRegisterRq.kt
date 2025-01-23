package ecowind.ru.requests.register

data class ClientRegisterRq(
    val login: String,
    val password: String,
    val personalData: PersonalDataRegisterRq? = null,
    val socialMedia: SocialMediaRegisterRq? = null
)

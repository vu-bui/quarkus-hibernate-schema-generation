package org.acme.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Post(
    @Id
    var id: Long = 0,

    var title: String = "",
)
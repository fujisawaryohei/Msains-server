package models.domain

case class CommentReply(
    id: Int,
    commentID: Int,
    content: String,
    createdAt: java.time.Instant)

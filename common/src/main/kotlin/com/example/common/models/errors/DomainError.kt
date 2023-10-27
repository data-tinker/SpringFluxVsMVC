package com.example.common.models.errors

sealed class DomainError(val reason: String) : Error() {
    class RandomServiceError(reason: String) : DomainError(reason)
}

package com.rosan.installer.data.app.model.entity.error

class InstallFailedInvalidURIException : Exception {
    constructor() : super()

    constructor(message: String?) : super(message)
}
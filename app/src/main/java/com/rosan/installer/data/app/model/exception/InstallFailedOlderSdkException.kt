package com.rosan.installer.data.app.model.exception

class InstallFailedOlderSdkException : Exception {
    constructor() : super()

    constructor(message: String?) : super(message)
}
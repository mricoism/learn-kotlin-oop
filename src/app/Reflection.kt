package app

import annotation.NotBlank
import data.CreateProductRequest
import data.CreateCategoryRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validateRequestV1(request: CreateProductRequest) {
    if (request.id == "") {
        throw ValidationException("id is blank")
    } else if (request.name == "") {
        throw ValidationException("name is blank")
    }
}

fun validateRequestV1(request: CreateCategoryRequest) {
    if (request.id == "") {
        throw ValidationException("id is blank")
    } else if (request.name == "") {
        throw ValidationException("name is blank")
    }
}

fun validateRequestV2(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
            when (value) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException("${property.name}is blank")
                    }
                    println(property.name)
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("kt01", "Indomie", 1_500)
    validateRequestV2(request)

    val categoryReq = CreateCategoryRequest("", "Noodle")
    validateRequestV2(categoryReq)
}
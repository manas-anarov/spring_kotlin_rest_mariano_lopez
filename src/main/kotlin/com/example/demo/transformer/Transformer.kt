package com.example.demo.transformer

interface Transformer <A, B> {
    fun transform(source: A):B
}
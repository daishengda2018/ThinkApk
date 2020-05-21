package com.mrcd

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 *
 * Create by im_dsd 2020/5/21 13:46
 */
class ThinkApkPlugin :Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.create("thinkRes") {
            it.doLast {
                println("Hello from ThinkApkPlugin")
            }
        }.apply {
            group = "think"
        }
    }
}

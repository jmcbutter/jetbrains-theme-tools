package com.jmcbutter.shopifyliquid
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

class ShopifyLiquidLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Shopify Liquid"){
    override fun isSupportedFile(file: VirtualFile): Boolean = file.fileType == ShopifyLiquidFileType

    override fun createCommandLine(): GeneralCommandLine {
        return GeneralCommandLine("shopify", "theme", "language-server")
    }
}
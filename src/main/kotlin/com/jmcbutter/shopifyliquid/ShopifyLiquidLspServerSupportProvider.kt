package com.jmcbutter.shopifyliquid
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerSupportProvider

class ShopifyLiquidLspServerSupportProvider : LspServerSupportProvider {
    override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerSupportProvider.LspServerStarter) {
        if (file.fileType == ShopifyLiquidFileType) {
            serverStarter.ensureServerStarted(ShopifyLiquidLspServerDescriptor(project))
        }
    }
}
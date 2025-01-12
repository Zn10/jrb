import request from '@/utils/request'
export default{
    getListPage(keyword,limit,page){
        return request({
            method:'get',
            url:`/admin/core/borrower/getListPage/${limit}/${page}`,
            params:{keyword}//?keyword=keyword
        })
    },
    getBorrowerById(id){
        return request({
            method:'get',
            url:`/admin/core/borrower/getBorrowerById/${id}`
        })
    },
    approvalSubmit(approvalForm){
        return request({
            method:'POST',
            url:`/admin/core/borrower/approvalSubmit/`,
            data:approvalForm
        })
    }
}
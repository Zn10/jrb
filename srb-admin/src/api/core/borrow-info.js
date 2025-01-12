import request from '@/utils/request'
export default{
    getList(){
        return request({
            url:'/admin/core/borrowInfo/getList',
            method:'get'
        })
    },
    show(id){
        return request({
            url:`/admin/core/borrowInfo/show/${id}`,
            method:'get'
        })
    },
    approvalSubmit(borrowInfoApproval){
        return request({
            url:`/admin/core/borrowInfo/approvalSubmit`,
            method:'post',
            data:borrowInfoApproval
        })
    }
}
import request from '@/utils/request'

export default{
    getList(){
        return request({
            url:'/admin/core/integralGrade/list',
            method:'get'
        })
    },
    removeById(id){
        return request({
            url:`/admin/core/integralGrade/remove/${id}`,
            method:'delete'
        })
    },
    save(integralGrade){
        return request({
            url:`/admin/core/integralGrade/save`,
            method:'post',
            data:integralGrade
        })
    },
    getById(id){
        return request({
            url:`/admin/core/integralGrade/getById/${id}`,
            method:'get'
        })
    },
    updateById(integralGrade){
        return request({
            url:`/admin/core/integralGrade/updateById`,
            method:'put',
            data:integralGrade
        })
    }
}
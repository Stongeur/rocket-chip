// See LICENSE for license details.

package rocket

import Chisel._

/* Automatically generated by parse-opcodes */
object Instructions {
  def BEQ                = BitPat("b?????????????????000?????1100011")
  def BNE                = BitPat("b?????????????????001?????1100011")
  def BLT                = BitPat("b?????????????????100?????1100011")
  def BGE                = BitPat("b?????????????????101?????1100011")
  def BLTU               = BitPat("b?????????????????110?????1100011")
  def BGEU               = BitPat("b?????????????????111?????1100011")
  def JALR               = BitPat("b?????????????????000?????1100111")
  def JAL                = BitPat("b?????????????????????????1101111")
  def LUI                = BitPat("b?????????????????????????0110111")
  def AUIPC              = BitPat("b?????????????????????????0010111")
  def ADDI               = BitPat("b?????????????????000?????0010011")
  def SLLI               = BitPat("b000000???????????001?????0010011")
  def SLTI               = BitPat("b?????????????????010?????0010011")
  def SLTIU              = BitPat("b?????????????????011?????0010011")
  def XORI               = BitPat("b?????????????????100?????0010011")
  def SRLI               = BitPat("b000000???????????101?????0010011")
  def SRAI               = BitPat("b010000???????????101?????0010011")
  def ORI                = BitPat("b?????????????????110?????0010011")
  def ANDI               = BitPat("b?????????????????111?????0010011")
  def ADD                = BitPat("b0000000??????????000?????0110011")
  def SUB                = BitPat("b0100000??????????000?????0110011")
  def SLL                = BitPat("b0000000??????????001?????0110011")
  def SLT                = BitPat("b0000000??????????010?????0110011")
  def SLTU               = BitPat("b0000000??????????011?????0110011")
  def XOR                = BitPat("b0000000??????????100?????0110011")
  def SRL                = BitPat("b0000000??????????101?????0110011")
  def SRA                = BitPat("b0100000??????????101?????0110011")
  def OR                 = BitPat("b0000000??????????110?????0110011")
  def AND                = BitPat("b0000000??????????111?????0110011")
  def ADDIW              = BitPat("b?????????????????000?????0011011")
  def SLLIW              = BitPat("b0000000??????????001?????0011011")
  def SRLIW              = BitPat("b0000000??????????101?????0011011")
  def SRAIW              = BitPat("b0100000??????????101?????0011011")
  def ADDW               = BitPat("b0000000??????????000?????0111011")
  def SUBW               = BitPat("b0100000??????????000?????0111011")
  def SLLW               = BitPat("b0000000??????????001?????0111011")
  def SRLW               = BitPat("b0000000??????????101?????0111011")
  def SRAW               = BitPat("b0100000??????????101?????0111011")
  def LB                 = BitPat("b?????????????????000?????0000011")
  def LH                 = BitPat("b?????????????????001?????0000011")
  def LW                 = BitPat("b?????????????????010?????0000011")
  def LD                 = BitPat("b?????????????????011?????0000011")
  def LBU                = BitPat("b?????????????????100?????0000011")
  def LHU                = BitPat("b?????????????????101?????0000011")
  def LWU                = BitPat("b?????????????????110?????0000011")
  def SB                 = BitPat("b?????????????????000?????0100011")
  def SH                 = BitPat("b?????????????????001?????0100011")
  def SW                 = BitPat("b?????????????????010?????0100011")
  def SD                 = BitPat("b?????????????????011?????0100011")
  def FENCE              = BitPat("b?????????????????000?????0001111")
  def FENCE_I            = BitPat("b?????????????????001?????0001111")
  def MUL                = BitPat("b0000001??????????000?????0110011")
  def MULH               = BitPat("b0000001??????????001?????0110011")
  def MULHSU             = BitPat("b0000001??????????010?????0110011")
  def MULHU              = BitPat("b0000001??????????011?????0110011")
  def DIV                = BitPat("b0000001??????????100?????0110011")
  def DIVU               = BitPat("b0000001??????????101?????0110011")
  def REM                = BitPat("b0000001??????????110?????0110011")
  def REMU               = BitPat("b0000001??????????111?????0110011")
  def MULW               = BitPat("b0000001??????????000?????0111011")
  def DIVW               = BitPat("b0000001??????????100?????0111011")
  def DIVUW              = BitPat("b0000001??????????101?????0111011")
  def REMW               = BitPat("b0000001??????????110?????0111011")
  def REMUW              = BitPat("b0000001??????????111?????0111011")
  def AMOADD_W           = BitPat("b00000????????????010?????0101111")
  def AMOXOR_W           = BitPat("b00100????????????010?????0101111")
  def AMOOR_W            = BitPat("b01000????????????010?????0101111")
  def AMOAND_W           = BitPat("b01100????????????010?????0101111")
  def AMOMIN_W           = BitPat("b10000????????????010?????0101111")
  def AMOMAX_W           = BitPat("b10100????????????010?????0101111")
  def AMOMINU_W          = BitPat("b11000????????????010?????0101111")
  def AMOMAXU_W          = BitPat("b11100????????????010?????0101111")
  def AMOSWAP_W          = BitPat("b00001????????????010?????0101111")
  def LR_W               = BitPat("b00010??00000?????010?????0101111")
  def SC_W               = BitPat("b00011????????????010?????0101111")
  def AMOADD_D           = BitPat("b00000????????????011?????0101111")
  def AMOXOR_D           = BitPat("b00100????????????011?????0101111")
  def AMOOR_D            = BitPat("b01000????????????011?????0101111")
  def AMOAND_D           = BitPat("b01100????????????011?????0101111")
  def AMOMIN_D           = BitPat("b10000????????????011?????0101111")
  def AMOMAX_D           = BitPat("b10100????????????011?????0101111")
  def AMOMINU_D          = BitPat("b11000????????????011?????0101111")
  def AMOMAXU_D          = BitPat("b11100????????????011?????0101111")
  def AMOSWAP_D          = BitPat("b00001????????????011?????0101111")
  def LR_D               = BitPat("b00010??00000?????011?????0101111")
  def SC_D               = BitPat("b00011????????????011?????0101111")
  def SCALL              = BitPat("b00000000000000000000000001110011")
  def SBREAK             = BitPat("b00000000000100000000000001110011")
  def SRET               = BitPat("b00010000000000000000000001110011")
  def SFENCE_VM          = BitPat("b000100000001?????000000001110011")
  def WFI                = BitPat("b00010000001000000000000001110011")
  def MRTH               = BitPat("b00110000011000000000000001110011")
  def MRTS               = BitPat("b00110000010100000000000001110011")
  def HRTS               = BitPat("b00100000010100000000000001110011")
  def CSRRW              = BitPat("b?????????????????001?????1110011")
  def CSRRS              = BitPat("b?????????????????010?????1110011")
  def CSRRC              = BitPat("b?????????????????011?????1110011")
  def CSRRWI             = BitPat("b?????????????????101?????1110011")
  def CSRRSI             = BitPat("b?????????????????110?????1110011")
  def CSRRCI             = BitPat("b?????????????????111?????1110011")
  def FADD_S             = BitPat("b0000000??????????????????1010011")
  def FSUB_S             = BitPat("b0000100??????????????????1010011")
  def FMUL_S             = BitPat("b0001000??????????????????1010011")
  def FDIV_S             = BitPat("b0001100??????????????????1010011")
  def FSGNJ_S            = BitPat("b0010000??????????000?????1010011")
  def FSGNJN_S           = BitPat("b0010000??????????001?????1010011")
  def FSGNJX_S           = BitPat("b0010000??????????010?????1010011")
  def FMIN_S             = BitPat("b0010100??????????000?????1010011")
  def FMAX_S             = BitPat("b0010100??????????001?????1010011")
  def FSQRT_S            = BitPat("b010110000000?????????????1010011")
  def FADD_D             = BitPat("b0000001??????????????????1010011")
  def FSUB_D             = BitPat("b0000101??????????????????1010011")
  def FMUL_D             = BitPat("b0001001??????????????????1010011")
  def FDIV_D             = BitPat("b0001101??????????????????1010011")
  def FSGNJ_D            = BitPat("b0010001??????????000?????1010011")
  def FSGNJN_D           = BitPat("b0010001??????????001?????1010011")
  def FSGNJX_D           = BitPat("b0010001??????????010?????1010011")
  def FMIN_D             = BitPat("b0010101??????????000?????1010011")
  def FMAX_D             = BitPat("b0010101??????????001?????1010011")
  def FCVT_S_D           = BitPat("b010000000001?????????????1010011")
  def FCVT_D_S           = BitPat("b010000100000?????????????1010011")
  def FSQRT_D            = BitPat("b010110100000?????????????1010011")
  def FLE_S              = BitPat("b1010000??????????000?????1010011")
  def FLT_S              = BitPat("b1010000??????????001?????1010011")
  def FEQ_S              = BitPat("b1010000??????????010?????1010011")
  def FLE_D              = BitPat("b1010001??????????000?????1010011")
  def FLT_D              = BitPat("b1010001??????????001?????1010011")
  def FEQ_D              = BitPat("b1010001??????????010?????1010011")
  def FCVT_W_S           = BitPat("b110000000000?????????????1010011")
  def FCVT_WU_S          = BitPat("b110000000001?????????????1010011")
  def FCVT_L_S           = BitPat("b110000000010?????????????1010011")
  def FCVT_LU_S          = BitPat("b110000000011?????????????1010011")
  def FMV_X_S            = BitPat("b111000000000?????000?????1010011")
  def FCLASS_S           = BitPat("b111000000000?????001?????1010011")
  def FCVT_W_D           = BitPat("b110000100000?????????????1010011")
  def FCVT_WU_D          = BitPat("b110000100001?????????????1010011")
  def FCVT_L_D           = BitPat("b110000100010?????????????1010011")
  def FCVT_LU_D          = BitPat("b110000100011?????????????1010011")
  def FMV_X_D            = BitPat("b111000100000?????000?????1010011")
  def FCLASS_D           = BitPat("b111000100000?????001?????1010011")
  def FCVT_S_W           = BitPat("b110100000000?????????????1010011")
  def FCVT_S_WU          = BitPat("b110100000001?????????????1010011")
  def FCVT_S_L           = BitPat("b110100000010?????????????1010011")
  def FCVT_S_LU          = BitPat("b110100000011?????????????1010011")
  def FMV_S_X            = BitPat("b111100000000?????000?????1010011")
  def FCVT_D_W           = BitPat("b110100100000?????????????1010011")
  def FCVT_D_WU          = BitPat("b110100100001?????????????1010011")
  def FCVT_D_L           = BitPat("b110100100010?????????????1010011")
  def FCVT_D_LU          = BitPat("b110100100011?????????????1010011")
  def FMV_D_X            = BitPat("b111100100000?????000?????1010011")
  def FLW                = BitPat("b?????????????????010?????0000111")
  def FLD                = BitPat("b?????????????????011?????0000111")
  def FSW                = BitPat("b?????????????????010?????0100111")
  def FSD                = BitPat("b?????????????????011?????0100111")
  def FMADD_S            = BitPat("b?????00??????????????????1000011")
  def FMSUB_S            = BitPat("b?????00??????????????????1000111")
  def FNMSUB_S           = BitPat("b?????00??????????????????1001011")
  def FNMADD_S           = BitPat("b?????00??????????????????1001111")
  def FMADD_D            = BitPat("b?????01??????????????????1000011")
  def FMSUB_D            = BitPat("b?????01??????????????????1000111")
  def FNMSUB_D           = BitPat("b?????01??????????????????1001011")
  def FNMADD_D           = BitPat("b?????01??????????????????1001111")
  def CUSTOM0            = BitPat("b?????????????????000?????0001011")
  def CUSTOM0_RS1        = BitPat("b?????????????????010?????0001011")
  def CUSTOM0_RS1_RS2    = BitPat("b?????????????????011?????0001011")
  def CUSTOM0_RD         = BitPat("b?????????????????100?????0001011")
  def CUSTOM0_RD_RS1     = BitPat("b?????????????????110?????0001011")
  def CUSTOM0_RD_RS1_RS2 = BitPat("b?????????????????111?????0001011")
  def CUSTOM1            = BitPat("b?????????????????000?????0101011")
  def CUSTOM1_RS1        = BitPat("b?????????????????010?????0101011")
  def CUSTOM1_RS1_RS2    = BitPat("b?????????????????011?????0101011")
  def CUSTOM1_RD         = BitPat("b?????????????????100?????0101011")
  def CUSTOM1_RD_RS1     = BitPat("b?????????????????110?????0101011")
  def CUSTOM1_RD_RS1_RS2 = BitPat("b?????????????????111?????0101011")
  def CUSTOM2            = BitPat("b?????????????????000?????1011011")
  def CUSTOM2_RS1        = BitPat("b?????????????????010?????1011011")
  def CUSTOM2_RS1_RS2    = BitPat("b?????????????????011?????1011011")
  def CUSTOM2_RD         = BitPat("b?????????????????100?????1011011")
  def CUSTOM2_RD_RS1     = BitPat("b?????????????????110?????1011011")
  def CUSTOM2_RD_RS1_RS2 = BitPat("b?????????????????111?????1011011")
  def CUSTOM3            = BitPat("b?????????????????000?????1111011")
  def CUSTOM3_RS1        = BitPat("b?????????????????010?????1111011")
  def CUSTOM3_RS1_RS2    = BitPat("b?????????????????011?????1111011")
  def CUSTOM3_RD         = BitPat("b?????????????????100?????1111011")
  def CUSTOM3_RD_RS1     = BitPat("b?????????????????110?????1111011")
  def CUSTOM3_RD_RS1_RS2 = BitPat("b?????????????????111?????1111011")
  def SLLI_RV32          = BitPat("b0000000??????????001?????0010011")
  def SRLI_RV32          = BitPat("b0000000??????????101?????0010011")
  def SRAI_RV32          = BitPat("b0100000??????????101?????0010011")
  def FRFLAGS            = BitPat("b00000000000100000010?????1110011")
  def FSFLAGS            = BitPat("b000000000001?????001?????1110011")
  def FSFLAGSI           = BitPat("b000000000001?????101?????1110011")
  def FRRM               = BitPat("b00000000001000000010?????1110011")
  def FSRM               = BitPat("b000000000010?????001?????1110011")
  def FSRMI              = BitPat("b000000000010?????101?????1110011")
  def FSCSR              = BitPat("b000000000011?????001?????1110011")
  def FRCSR              = BitPat("b00000000001100000010?????1110011")
  def RDCYCLE            = BitPat("b11000000000000000010?????1110011")
  def RDTIME             = BitPat("b11000000000100000010?????1110011")
  def RDINSTRET          = BitPat("b11000000001000000010?????1110011")
  def RDCYCLEH           = BitPat("b11001000000000000010?????1110011")
  def RDTIMEH            = BitPat("b11001000000100000010?????1110011")
  def RDINSTRETH         = BitPat("b11001000001000000010?????1110011")
  def ECALL              = BitPat("b00000000000000000000000001110011")
  def EBREAK             = BitPat("b00000000000100000000000001110011")
  def ERET               = BitPat("b00010000000000000000000001110011")
}
object Causes {
  val misaligned_fetch = 0x0
  val fault_fetch = 0x1
  val illegal_instruction = 0x2
  val breakpoint = 0x3
  val misaligned_load = 0x4
  val fault_load = 0x5
  val misaligned_store = 0x6
  val fault_store = 0x7
  val user_ecall = 0x8
  val supervisor_ecall = 0x9
  val hypervisor_ecall = 0xa
  val machine_ecall = 0xb
  val all = {
    val res = collection.mutable.ArrayBuffer[Int]()
    res += misaligned_fetch
    res += fault_fetch
    res += illegal_instruction
    res += breakpoint
    res += misaligned_load
    res += fault_load
    res += misaligned_store
    res += fault_store
    res += user_ecall
    res += supervisor_ecall
    res += hypervisor_ecall
    res += machine_ecall
    res.toArray
  }
}
object CSRs {
  val fflags = 0x1
  val frm = 0x2
  val fcsr = 0x3
  val cycle = 0xc00
  val time = 0xc01
  val instret = 0xc02
  val stats = 0xc0
  val uarch0 = 0xcc0
  val uarch1 = 0xcc1
  val uarch2 = 0xcc2
  val uarch3 = 0xcc3
  val uarch4 = 0xcc4
  val uarch5 = 0xcc5
  val uarch6 = 0xcc6
  val uarch7 = 0xcc7
  val uarch8 = 0xcc8
  val uarch9 = 0xcc9
  val uarch10 = 0xcca
  val uarch11 = 0xccb
  val uarch12 = 0xccc
  val uarch13 = 0xccd
  val uarch14 = 0xcce
  val uarch15 = 0xccf
  val sstatus = 0x100
  val stvec = 0x101
  val sie = 0x104
  val sscratch = 0x140
  val sepc = 0x141
  val sip = 0x144
  val sptbr = 0x180
  val sasid = 0x181
  val cyclew = 0x900
  val timew = 0x901
  val instretw = 0x902
  val stime = 0xd01
  val scause = 0xd42
  val sbadaddr = 0xd43
  val stimew = 0xa01
  val mstatus = 0x300
  val mtvec = 0x301
  val mtdeleg = 0x302
  val mie = 0x304
  val mtimecmp = 0x321
  val mscratch = 0x340
  val mepc = 0x341
  val mcause = 0x342
  val mbadaddr = 0x343
  val mip = 0x344
  val mtime = 0x701
  val mcpuid = 0xf00
  val mimpid = 0xf01
  val mhartid = 0xf10
  val mtohost = 0x780
  val mfromhost = 0x781
  val mreset = 0x782
  val mipi = 0x783
  val miobase = 0x784
  val cycleh = 0xc80
  val timeh = 0xc81
  val instreth = 0xc82
  val cyclehw = 0x980
  val timehw = 0x981
  val instrethw = 0x982
  val stimeh = 0xd81
  val stimehw = 0xa81
  val mtimecmph = 0x361
  val mtimeh = 0x741
  val mrwbase = 0x790
  val all = {
    val res = collection.mutable.ArrayBuffer[Int]()
    res += fflags
    res += frm
    res += fcsr
    res += cycle
    res += time
    res += instret
    res += stats
    res += uarch0
    res += uarch1
    res += uarch2
    res += uarch3
    res += uarch4
    res += uarch5
    res += uarch6
    res += uarch7
    res += uarch8
    res += uarch9
    res += uarch10
    res += uarch11
    res += uarch12
    res += uarch13
    res += uarch14
    res += uarch15
    res += sstatus
    res += stvec
    res += sie
    res += sscratch
    res += sepc
    res += sip
    res += sptbr
    res += sasid
    res += cyclew
    res += timew
    res += instretw
    res += stime
    res += scause
    res += sbadaddr
    res += stimew
    res += mstatus
    res += mtvec
    res += mtdeleg
    res += mie
    res += mtimecmp
    res += mscratch
    res += mepc
    res += mcause
    res += mbadaddr
    res += mip
    res += mtime
    res += mcpuid
    res += mimpid
    res += mhartid
    res += mtohost
    res += mfromhost
    res += mreset
    res += mipi
    res += miobase
    res.toArray
  }
  val all32 = {
    val res = collection.mutable.ArrayBuffer(all:_*)
    res += cycleh
    res += timeh
    res += instreth
    res += cyclehw
    res += timehw
    res += instrethw
    res += stimeh
    res += stimehw
    res += mtimecmph
    res += mtimeh
    res.toArray
  }
}
